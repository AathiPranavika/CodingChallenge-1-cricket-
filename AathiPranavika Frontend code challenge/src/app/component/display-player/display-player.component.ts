import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-display-player',
  templateUrl: './display-player.component.html',
  styleUrls: ['./display-player.component.css']
})
export class DisplayPlayerComponent {

  allPlayers: Player[] = [];
  filteredPlayers: Player[] = [];
  filterPlayerId!: number | null;

  constructor(private playerService: PlayerService) {
    this.displayAll();
  }

  displayAll(): void {
    this.playerService.getAll().subscribe(players => {
      this.allPlayers = players;
      this.filteredPlayers = players;
    });
  }

  delete(playerId: number): void {
    this.playerService.delete(playerId).subscribe(() => {
      alert('Player deleted successfully');
        this.displayAll();

    });
  }
hasFiltered: boolean = false;

filterById(): void {
  this.hasFiltered = true;  
  if (!this.filterPlayerId) {
    this.filteredPlayers = this.allPlayers; 
  } 
  else {
    this.playerService.getById(this.filterPlayerId).subscribe({
  next: (player) => {
    this.filteredPlayers = [player];
  },
  error: (err) => {
    console.error('Player not found', err);
    this.filteredPlayers = [];
  }
});
  }
}

}
