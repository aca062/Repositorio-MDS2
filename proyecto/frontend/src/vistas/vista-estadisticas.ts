import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-charts/src/vaadin-chart.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-estadisticas')
export class VistaEstadisticas extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutPrincipal">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;background-color: var(--lumo-contrast-10pct);" id="layoutEstadisticas">
  <h2 id="h2TituloEst">Tus estadísticas</h2>
 </vaadin-horizontal-layout>
 <h2 style="align-self: center;" id="h21masEscuchadas">Más escuchados</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-l);" id="layoutEstadisticasMas">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutCancion">
   <h4 style="align-self: center;" id="h4">Canción</h4>
   <img style="align-self: center; width: 150px;" id="imgCancion" src="https://i.scdn.co/image/ab67616d00001e023e0698e4ae5ffb82a005aeeb">
   <h4 style="align-self: center;" id="h41Titulo">Wishing Well</h4>
   <h4 style="align-self: center;" id="h42Veces">123</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutArtista">
   <h4 style="align-self: center;" id="h43">Artista</h4>
   <img style="align-self: center; width: 150px;" id="img1Artista" src="https://i.scdn.co/image/ab67616d0000b2730bed3b3776638266914b5268">
   <h4 style="align-self: center;" id="h44Nombre">Juice WRLD</h4>
   <h4 style="align-self: center;" id="h45Horas">647 horas</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutAlbum">
   <h4 style="align-self: center;" id="h46">Álbum</h4>
   <img style="align-self: center; width: 150px;" id="img2Album" src="https://m.media-amazon.com/images/I/81hF73Kv9GL._SL1200_.jpg">
   <h4 style="align-self: center;" id="h47Nombre">Legends never die</h4>
   <h4 style="align-self: center;" id="h48Horas">356 horas</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutLista">
   <h4 style="align-self: center;" id="h49">Lista de reproducción</h4>
   <img style="align-self: center; width: 150px;" id="img3Lista" src="https://i.scdn.co/image/ab67706f0000000362a2b2b0d95d902b307837d2">
   <h4 style="align-self: center;" id="h410Nombre">This is Juice WRLD</h4>
   <h4 style="align-self: center;" id="h411Horas">243 horas</h4>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <h2 style="align-self: center;" id="h22Uso">Tiempo de uso</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="layoutTiempoUso">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center;" id="layoutUso">
   <h4 style="align-self: center;" id="h412">Tiempo de uso de este año</h4>
   <h4 style="align-self: center;" id="h413">1000 horas</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutGrafica">
   <vaadin-chart type="column" title="Tiempo de uso de la última semana" subtitle="Source: Nombre app" categories="[&quot;L&quot;, &quot;M&quot;, &quot;X&quot;, &quot;J&quot;, &quot;V&quot;, &quot;S&quot;,
  &quot;D&quot;]" additional-options="{ &quot;tooltip&quot;: {  &quot;shared&quot;: true  }  }" id="graficaUso">
    <vaadin-chart-series title="Uso diario" values="[5, 2, 3, 1, 8, 4, 3.5]"></vaadin-chart-series>
   </vaadin-chart>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center;" id="layoutMedia">
   <h4 style="align-self: center;" id="h415">Media</h4>
   <h4 style="align-self: center;" id="h416">4 horas</h4>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
