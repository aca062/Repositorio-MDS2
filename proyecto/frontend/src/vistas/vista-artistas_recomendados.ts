import { LitElement, html, css, customElement } from 'lit-element';
import './vista-artista_elemento';

@customElement('vista-artistas_recomendados')
export class VistaArtistas_recomendados extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h1 id="h1">Artistas</h1>
 <vista-artista_elemento id="vistaArtista_elemento" style="align-self: flex-start; height: 200px; flex-grow: 0; flex-shrink: 1;"></vista-artista_elemento>
 <vista-artista_elemento id="vistaArtista_elemento1" style="height: 200px;"></vista-artista_elemento>
 <vista-artista_elemento id="vistaArtista_elemento2" style="height: 200px;"></vista-artista_elemento>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
