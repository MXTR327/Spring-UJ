import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { IProduct } from '@interfaces/IProduct';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class Product
{
  #baseUrl = 'http://localhost:8080/inventario-app/productos';
  #http = inject(HttpClient);

  agregarProducto(product: IProduct): Observable<IProduct>
  {
    return this.#http.post<IProduct>(this.#baseUrl, product);
  }

  obtenerProductosLista(): Observable<IProduct[]>
  {
    return this.#http.get<IProduct[]>(this.#baseUrl);
  }
}
