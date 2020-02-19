import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VerPlatosComponent } from './Menu/ver-platos/ver-platos.component';
import { VerMesasComponent } from './Mesas/ver-mesas/ver-mesas.component';


const routes: Routes = [
  {path: 'verMenu', component: VerPlatosComponent},
  {path: 'verMesas', component: VerMesasComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
