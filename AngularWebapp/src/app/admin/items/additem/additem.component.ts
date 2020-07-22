import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Item } from '../../../model/Item';
import { HttpClientService } from '../../../service/http-client.service';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-additem',
  templateUrl: './additem.component.html',
  styleUrls: ['./additem.component.css']
})
export class AdditemComponent implements OnInit {

  @Input()
  item: Item;
  private selectedFile;
  imgURL: any;

  @Output()
  itemAddedEvent = new EventEmitter();

  constructor(private httpClientService: HttpClientService,
    private activedRoute: ActivatedRoute,
    private router: Router,
    private httpClient: HttpClient) { }

  ngOnInit(): void {
  }

  public onFileChanged(event) {
    console.log(event);
    this.selectedFile = event.target.files[0];

    let reader = new FileReader();
    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event2) => {
      this.imgURL = reader.result;
    };

  }

  saveItem() {
    //If there is no item id then it is an add item call else it is an edit item call
    if (this.item.id == null) {

      const uploadData = new FormData();
      uploadData.append('imageFile', this.selectedFile, this.selectedFile.name);
      this.selectedFile.imageName = this.selectedFile.name;

      this.httpClient.post('http://localhost:8082/items/upload', uploadData, { observe: 'response' })
        .subscribe((response) => {
          if (response.status === 200) {
            this.httpClientService.addItem(this.item).subscribe(
              (item) => {
                this.itemAddedEvent.emit();
                this.router.navigate(['admin', 'items']);
              }
            );
            console.log('Image uploaded successfully');
          } else {
            console.log('Image not uploaded successfully');
          }
        }
        );
    } else {
      this.httpClientService.updateItem(this.item).subscribe(
        (item) => {
          this.itemAddedEvent.emit();
          this.router.navigate(['admin', 'items']);
        }
      );
    }

  }


}
