import { Component, inject } from '@angular/core';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '@services/product';

@Component({
  selector: 'app-agregar-producto',
  imports: [ReactiveFormsModule],
  templateUrl: './agregar-producto.html',
})
export class AgregarProducto
{
  #fb = inject(FormBuilder);
  #productService = inject(Product);

  #router = inject( Router );

  

  onSubmit()
  {}
}
