import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista_de_reproduccion_propia')
export class VistaLista_de_reproduccion_propia extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="layoutListaPropia" style="height: 200px; align-items: center; align-self: flex-start;">
  <img id="imgListaPropia" style="0 object-fit:contain; width: 150px; height: 150px;" src="https://i.scdn.co/image/ab67706f00000003568579a7b48bad7547095271">
  <vaadin-button id="botonNombre" style="align-self: center;">
    This is Bad Bunny 
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
