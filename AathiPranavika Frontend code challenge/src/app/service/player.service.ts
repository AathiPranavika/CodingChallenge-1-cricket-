import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Player } from '../model/Player';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http:HttpClient) {

  }

  baseURL="http://localhost:8081/api/players/";

  addPlayer(playerDetails:Player):Observable<Player>
  {
    console.log(playerDetails);
    return this.http.post<Player>(this.baseURL+"addPlayer",playerDetails);
  }

   getAll():Observable<Player[]>{

        return this.http.get<Player[]>(this.baseURL);


    }

    
  updatePlayer(playerDetails:Player,playerId:number):Observable<Player>
  {
    console.log(playerDetails);
    return this.http.put<Player>(this.baseURL+playerId,playerDetails);
  }

   getById(playerId:number):Observable<Player>{

        return this.http.get<Player>(this.baseURL+playerId);


    }

    
    delete(playerId:number):Observable<string>{

      return  this.http.delete<string>(this.baseURL+playerId);

    }

    
   getAllSpecificDetails():Observable<Player[]>{

        return this.http.get<Player[]>(this.baseURL+"getAll");


    }




}
