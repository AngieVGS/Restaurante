import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule} from '@angular/material/card';
import { FormsModule} from '@angular/forms';
import { IngredientesService } from './Service/ServiceIngredientes/ingredientes.service';
import { VerPlatosComponent } from './Menu/ver-platos/ver-platos.component';
import { VerMesasComponent } from './Mesas/ver-mesas/ver-mesas.component';
import { CardPlatoComponent } from './Menu/card-plato/card-plato.component';
import { HttpClientModule } from '@angular/common/http';
import { CardMesasComponent } from './Mesas/card-mesas/card-mesas.component';
import { LoginComponent } from './login/login.component';
import { ConfirmEmailComponent } from './login/confirm-email/confirm-email.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatNativeDateModule } from '@angular/material/core';
import { SideNavComponent } from './Base/side-nav/side-nav.component';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatButtonModule} from '@angular/material/button';
import {MatListModule} from '@angular/material/list';
import {MatIconModule} from '@angular/material/icon';
import {MatGridListModule} from '@angular/material/grid-list';
import { ListaProductosComponent } from './AgregarPedido/lista-productos/lista-productos.component';
import { PedidosComponent } from './AgregarPedido/pedidos/pedidos.component';
import { AgregarPedidoComponent } from './agregar-pedido/agregar-pedido.component';

@NgModule({
  declarations: [
    AppComponent,
    VerPlatosComponent,
    VerMesasComponent,
    CardPlatoComponent,
    CardMesasComponent,
    LoginComponent,
    ConfirmEmailComponent,
    SideNavComponent,
    ListaProductosComponent,
    PedidosComponent,
    AgregarPedidoComponent
  ],
  imports: [
    BrowserAnimationsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    FormsModule,
    HttpClientModule,
    FormsModule,
    MatNativeDateModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatSidenavModule,
    MatButtonModule,
    MatListModule,
    MatIconModule,
    MatGridListModule,
    BrowserModule
  ],
  providers: [IngredientesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
