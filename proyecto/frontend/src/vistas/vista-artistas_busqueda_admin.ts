import { LitElement, html, css, customElement } from 'lit-element';
import './vista-artista_admin';

@customElement('vista-artistas_busqueda_admin')
export class VistaArtistas_busqueda_admin extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vista-artista_admin id="vistaArtista_admin" style="width: 50%;"></vista-artista_admin>
  <vista-artista_admin id="vistaArtista_admin1" style="width: 50%;"></vista-artista_admin>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
