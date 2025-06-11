import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-update-player',
  templateUrl: './update-player.component.html',
  styleUrls: ['./update-player.component.css']
})
export class UpdatePlayerComponent {

  constructor(private playerService:PlayerService)
  {

  }


  playerData(data:Player)
    {
      this.playerService.updatePlayer(data,data.playerId).subscribe(
        (input)=>{
          alert("player updated successfully");
        }
      )
    }
  
}
