import { Injectable } from '@angular/core';
import { Plato } from 'src/app/Modelo/Plato';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlatosService {

  constructor(private http: HttpClient) {}

  Url = 'http://localhost:8080/verPlatos';

  getPlatos() {
    return this.http.get<Plato[]>(this.Url);
  }


}
