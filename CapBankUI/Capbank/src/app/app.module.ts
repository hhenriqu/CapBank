import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { FirstviewComponent } from './components/firstview/firstview.component';
import { PromosectionComponent } from './components/promosection/promosection.component';
import { FormsModule } from '@angular/forms';
import { CalculadorainvestimentoComponent } from './components/calculadorainvestimento/calculadorainvestimento.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    FirstviewComponent,
    PromosectionComponent,
    CalculadorainvestimentoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
