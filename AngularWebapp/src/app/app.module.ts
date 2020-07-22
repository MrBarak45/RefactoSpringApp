import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsersComponent } from './admin/users/users.component';
import { FooterComponent } from './footer/footer.component';
import { MenuComponent } from './menu/menu.component';
import { HttpClientModule } from '@angular/common/http';
import { ItemsComponent } from './admin/items/items.component';
import { AdditemComponent } from './admin/items/additem/additem.component';
import { ViewitemComponent } from './admin/items/viewitem/viewitem.component';
import { ViewuserComponent } from './admin/users/viewuser/viewuser.component';
import { AdduserComponent } from './admin/users/adduser/adduser.component';
import { ShopitemComponent } from './shopitem/shopitem.component';

@NgModule({
  declarations: [
    AppComponent,
    UsersComponent,
    FooterComponent,
    MenuComponent,
    ItemsComponent,
    AdditemComponent,
    ViewitemComponent,
    ViewuserComponent,
    AdduserComponent,
    ShopitemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
