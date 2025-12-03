import { Component, inject, signal } from '@angular/core';
import { rxResource } from '@angular/core/rxjs-interop';
import { IProduct } from '@interfaces/IProduct';
import { Product } from '@services/product';
import { map } from 'rxjs';

@Component({
  selector: 'app-producto-lista',
  imports: [],
  templateUrl: './producto-lista.html',
})
export class ProductoLista
{
  products = signal<IProduct[]>([]);

  #productService = inject(Product);

  _ = rxResource({
    params: () => ({}),
    stream: () =>
      this.#productService
        .obtenerProductosLista()
        .pipe(map(products => this.products.set(products))),
  });
}
