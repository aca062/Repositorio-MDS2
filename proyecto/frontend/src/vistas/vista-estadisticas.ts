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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;background-color: var(--lumo-contrast-10pct);">
  <h2>Tus estadísticas</h2>
 </vaadin-horizontal-layout>
 <h2 style="align-self: center;">Más escuchados</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <h4 style="align-self: center;">Canción</h4>
   <img style="align-self: center;">
   <h4 style="align-self: center;">Nombre</h4>
   <h4 style="align-self: center;">Numero de veces</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <h4 style="align-self: center;">Artista</h4>
   <img style="align-self: center;">
   <h4 style="align-self: center;">Nombre</h4>
   <h4 style="align-self: center;">Numero de veces</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <h4 style="align-self: center;">Álbum</h4>
   <img style="align-self: center;">
   <h4 style="align-self: center;">Nombre</h4>
   <h4 style="align-self: center;">Numero de veces</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <h4 style="align-self: center;">Lista de reproducción</h4>
   <img style="align-self: center;">
   <h4 style="align-self: center;">Nombre</h4>
   <h4 style="align-self: center;">Numero de veces</h4>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <h2 style="align-self: center;">Tiempo de uso</h2>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <h4 style="align-self: center;">Tiempo de uso de este año</h4>
   <h4 style="align-self: center;">Heading 4</h4>
   <h4 style="align-self: center;">Heading 4</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <vaadin-chart type="column" title="Tiempo de uso de la última semana" subtitle="Source: Nombre app" categories="[&quot;L&quot;, &quot;M&quot;, &quot;X&quot;, &quot;J&quot;, &quot;V&quot;, &quot;S&quot;,
  &quot;D&quot;]" additional-options="{ &quot;tooltip&quot;: {  &quot;shared&quot;: true  }  }">
    <vaadin-chart-series title="Uso diario" values="[5, 2, 3, 1, 8, 4, 3.5]"></vaadin-chart-series>
   </vaadin-chart>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <h4 style="align-self: center;">Media</h4>
   <h4 style="align-self: center;">Heading 4</h4>
   <h4 style="align-self: center;">Heading 4</h4>
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
