import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-album')
export class VistaAlbum extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="layoutPrincipal" style="width: 100%; height: 200px; justify-content: center; padding: var(--lumo-space-s);">
 <vaadin-horizontal-layout theme="spacing" id="layoutAlbum" style="align-items: center;">
  <img id="imgAlbum" style="width: 150px; height: 150px; object-fit: contain;">
  <vaadin-button id="titulo">
    El último tour del mundo 
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
