import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-artista_elemento';
import './vista-cancion';
import './vista-listas_de_reproduccion_busqueda';
import './vista-lista_de_reproduccion_ajena';
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%;">
  <vista-canciones_busqueda></vista-canciones_busqueda>
  <vista-cancion id="vistaCancion"></vista-cancion>
  <vista-cancion id="vistaCancion1"></vista-cancion>
  <vista-cancion id="vistaCancion2"></vista-cancion>
  <vista-cancion id="vistaCancion3"></vista-cancion>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <vista-listas_de_reproduccion_busqueda></vista-listas_de_reproduccion_busqueda>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%;">
  <vista-artistas_busqueda></vista-artistas_busqueda>
  <vista-artista_elemento id="vistaArtista_elemento"></vista-artista_elemento>
  <vista-artista_elemento id="vistaArtista_elemento1"></vista-artista_elemento>
  <vista-artista_elemento id="vistaArtista_elemento2"></vista-artista_elemento>
  <vista-artista_elemento id="vistaArtista_elemento3"></vista-artista_elemento>
  <vista-artista_elemento id="vistaArtista_elemento4"></vista-artista_elemento>
  <vista-artista_elemento id="vistaArtista_elemento5"></vista-artista_elemento>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
