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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%;">
  <vista-canciones_busqueda id="vistaCanciones_busqueda"></vista-canciones_busqueda>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="width: 100%;">
  <vista-listas_de_reproduccion_busqueda id="vistaListas_de_reproduccion_busqueda"></vista-listas_de_reproduccion_busqueda>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout2" style="width: 100%;">
  <vista-artistas_busqueda id="vistaArtistas_busqueda"></vista-artistas_busqueda>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
