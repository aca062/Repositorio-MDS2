import { LitElement, html, css, customElement } from 'lit-element';
import './vista-album';

@customElement('vista-lista_albumes')
export class VistaLista_albumes extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing-xl" id="layoutAlbumes">
  <vista-album id="vistaAlbum"></vista-album>
  <vista-album id="vistaAlbum1"></vista-album>
  <vista-album id="vistaAlbum2"></vista-album>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
