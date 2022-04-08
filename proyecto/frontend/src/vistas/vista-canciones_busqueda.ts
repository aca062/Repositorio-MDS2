import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion';

@customElement('vista-canciones_busqueda')
export class VistaCanciones_busqueda extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="layoutPrincipal">
 <h1 id="h1Titulo">Canciones</h1>
 <vista-cancion id="vistaCancion"></vista-cancion>
 <vista-cancion id="vistaCancion1"></vista-cancion>
 <vista-cancion id="vistaCancion2"></vista-cancion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
