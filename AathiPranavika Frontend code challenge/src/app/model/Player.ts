export interface Player {
  playerId: number;  // Optional, since it might be auto-generated
  playerName: string;
  jerseyNumber: number;
  role: 'Batsman' | 'Bowler' | 'Keeper' | 'All Rounder';  
  totalMatches: number;
  teamName: string;
  state: string;
  description?: string;  
}
