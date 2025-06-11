import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PalyerDashboardComponent } from './component/palyer-dashboard/palyer-dashboard.component';
import { AddPlayerComponent } from './component/add-player/add-player.component';
import { UpdatePlayerComponent } from './component/update-player/update-player.component';
import { DisplayPlayerComponent } from './component/display-player/display-player.component';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    PalyerDashboardComponent,
    AddPlayerComponent,
    UpdatePlayerComponent,
    DisplayPlayerComponent
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
