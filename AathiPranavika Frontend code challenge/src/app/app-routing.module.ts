import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPlayerComponent } from './component/add-player/add-player.component';
import { UpdatePlayerComponent } from './component/update-player/update-player.component';
import { DisplayPlayerComponent } from './component/display-player/display-player.component';

const routes: Routes = [
  {path:"add-player",component:AddPlayerComponent},
  {path:"update-player",component:UpdatePlayerComponent},
  {path:"display-player",component:DisplayPlayerComponent},
  { path: '', redirectTo: '/display-player', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
