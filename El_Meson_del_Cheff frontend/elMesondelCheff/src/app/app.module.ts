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

@NgModule({
  declarations: [
    AppComponent,
    VerPlatosComponent,
    VerMesasComponent,
    CardPlatoComponent,
    CardMesasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [IngredientesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
