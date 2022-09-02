import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculadorainvestimento',
  templateUrl: './calculadorainvestimento.component.html',
  styleUrls: ['./calculadorainvestimento.component.less']
})
export class CalculadorainvestimentoComponent {

  valor = 0.00;
  parcela12 = 0.00;
  parcela6 = 0.00;
  parcela3 = 0.00;

  parcelamento()
  {
    this.parcela12 = this.valor / 12
    this.parcela6 = this.valor / 6
    this.parcela3 = this.valor / 3
  }

}
