import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Mesa } from 'src/app/Modelo/Mesa';

@Injectable({
  providedIn: 'root'
})
export class MesasService {

  constructor(private http: HttpClient) {}

  Url = 'http://localhost:8080/verMesas';

  getMesas() {
    return this.http.get<Mesa[]>(this.Url);
  }


}
