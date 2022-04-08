import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-artista_admin')
export class VistaArtista_admin extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="layoutArtista" style="align-items: center; height: 200px;">
  <img id="imgArtista" style="width: 150px; height: 150px; object-fit: contain" src="https://pbs.twimg.com/media/E51LjjnXIAMO8NM.jpg">
  <h4 id="h4Nombre">Bad bunny</h4>
  <vaadin-button id="editar">
    Editar 
  </vaadin-button>
  <vaadin-button id="eliminar">
    Eliminar 
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
