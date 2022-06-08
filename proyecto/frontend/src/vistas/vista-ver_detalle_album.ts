import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_canciones';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_detalle_album')
export class VistaVer_detalle_album extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="layoutPrincipal">
 <vaadin-vertical-layout id="layoutAlbum" style="flex-grow: 0; margin: var(--lumo-space-l); align-items: center; width: 45%; align-self: center;">
  <vaadin-horizontal-layout theme="spacing">
   <img id="img" style="width: 200px; height: 200px;">
   <h5 id="titulo" style="align-self: center;">Heading 5</h5>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 600px; align-self: center; align-items: center;">
   <vaadin-button id="botonArtista" style="align-self: center; flex-grow: 0; margin-left: 20%;">
     Bad Bunny 
   </vaadin-button>
   <h5 id="h5FechaAlbum" style="align-self: center; margin-left: 15%;">27/11/2020</h5>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout id="layoutCancionesAlbum" style="align-self: center; width: 75%; height: 100%; background-color: var(--lumo-contrast-10pct); align-items: center; justify-content: flex-start;">
  <vista-lista_de_canciones id="vistaLista_de_canciones" style="width: 100%; height: 100%;"></vista-lista_de_canciones>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
