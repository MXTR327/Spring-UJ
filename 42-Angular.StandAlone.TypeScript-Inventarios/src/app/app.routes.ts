/* eslint-disable perfectionist/sort-objects */
import { Routes } from '@angular/router';

import { AgregarProducto } from './components/agregar-producto/agregar-producto';
import { ProductoLista } from './components/producto-lista/producto-lista';

// http://localhost:4200/productos
export const routes: Routes = [
  {
    path: 'productos',
    component: ProductoLista,
  },
  {
    path: '',
    redirectTo: 'productos',
    pathMatch: 'full',
  },
  {
    path: 'agregar-producto',
    component: AgregarProducto,
  },
];
