import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listas_de_reproduccion_busqueda';
import './vista-canciones_busqueda';
import './vista-artistas_busqueda';

@customElement('vista-buscar')
export class VistaBuscar extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;background-color: var(--lumo-contrast-10pct);" id="layoutPrincipal">
 <vaadin-vertical-layout id="layoutCanciones" style="width: 33%;">
  <vista-canciones_busqueda id="vistaCanciones_busqueda" style="width: 100%;"></vista-canciones_busqueda>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="layoutListas" style="width: 33%;">
  <vista-listas_de_reproduccion_busqueda id="vistaListas_de_reproduccion_busqueda" style="width: 100%;"></vista-listas_de_reproduccion_busqueda>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="layoutArtistas" style="width: 33%;">
  <vista-artistas_busqueda id="vistaArtistas_busqueda" style="width: 100%;"></vista-artistas_busqueda>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
