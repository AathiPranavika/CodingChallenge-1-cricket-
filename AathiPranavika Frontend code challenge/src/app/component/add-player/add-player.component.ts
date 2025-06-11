import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent {


  constructor(private playerService:PlayerService)
  {

  }

  playerData(data:Player)
  {
    this.playerService.addPlayer(data).subscribe(
      (input)=>{
        alert("player added successfully");
      }
    )
  }

}
