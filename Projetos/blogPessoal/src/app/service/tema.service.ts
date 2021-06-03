import { HttpClient, HttpHeaders,} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { tema } from '../model/Tema';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

  constructor(private http: HttpClient) { }

  token = {
    headers: new HttpHeaders().set('Authorization', environment.token)
  }

  getallTema(): Observable<tema[]>{
    return this.http.get<tema[]>('http://localhost:4200/tema', this.token)
  }

  postTema(Tema: tema): Observable<tema>{
    return this.http.post<tema>('http://localhost:4200/tema', tema,this.token)
  }

}
