import { LitElement, html, css, customElement } from 'lit-element';
import './vista-artista_elemento';

@customElement('vista-artistas_busqueda')
export class VistaArtistas_busqueda extends LitElement {
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
 <h1 id="h1Titulo">Artistas</h1>
 <vista-artista_elemento id="vistaArtista_elemento"></vista-artista_elemento>
 <vista-artista_elemento id="vistaArtista_elemento1"></vista-artista_elemento>
 <vista-artista_elemento id="vistaArtista_elemento2"></vista-artista_elemento>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
