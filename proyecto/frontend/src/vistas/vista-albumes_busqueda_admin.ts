import { LitElement, html, css, customElement } from 'lit-element';
import './vista-album_admin';

@customElement('vista-albumes_busqueda_admin')
export class VistaAlbumes_busqueda_admin extends LitElement {
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
 <h1 id="h1Titulo">Álbumes</h1>
 <vaadin-horizontal-layout theme="spacing" id="layoutLista">
  <vista-album_admin id="vistaAlbum_admin"></vista-album_admin>
  <vista-album_admin id="vistaAlbum_admin1"></vista-album_admin>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
