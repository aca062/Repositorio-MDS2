import { LitElement, html, css, customElement } from 'lit-element';
import './vista-artista_elemento';

@customElement('vista-artistas_similares')
export class VistaArtistas_similares extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout" theme="spacing-xl">
 <h1 id="h1">Artistas similares</h1>
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
