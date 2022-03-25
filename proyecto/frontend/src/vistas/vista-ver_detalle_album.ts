import { LitElement, html, css, customElement } from 'lit-element';
import './vista-album';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_de_canciones';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="flex-grow: 0; margin: var(--lumo-space-l);">
  <vista-album id="vistaAlbum" style="flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-m);"></vista-album>
  <vaadin-button id="vaadinButton" style="align-self: center; flex-grow: 0; margin-left: 20%;">
   Bad Bunny
  </vaadin-button>
  <h5 id="h5" style="align-self: center; margin-left: 15%;">27/11/2020</h5>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center; width: 80%; height: 100%;">
  <vista-lista_de_canciones id="vistaLista_de_canciones" style="width: 100%;"></vista-lista_de_canciones>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
