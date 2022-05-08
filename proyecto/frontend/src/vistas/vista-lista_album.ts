import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-album';

@customElement('vista-lista_album')
export class VistaLista_album extends LitElement {
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
 <h1 id="h1Titulo">Albumes</h1>
 <vaadin-vertical-layout theme="spacing" id="layoutAlbumes">
  <vista-album id="vistaAlbum"></vista-album>
  <vista-album id="vistaAlbum1"></vista-album>
  <vista-album id="vistaAlbum2"></vista-album>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: flex-end;" id="layoutBoton">
  <vaadin-button style="margin-right: var(--lumo-space-xl);" id="verMas">
    Ver mas 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
