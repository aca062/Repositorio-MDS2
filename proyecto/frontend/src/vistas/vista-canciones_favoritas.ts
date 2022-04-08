import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-cancion';

@customElement('vista-canciones_favoritas')
export class VistaCanciones_favoritas extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="layoutTitulo">
  <h1 id="h1Titulo">Canciones favoritas</h1>
  <vaadin-button style="align-self: center;" id="verMas">
    Ver más 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="layoutCanciones">
  <vista-cancion id="vistaCancion"></vista-cancion>
  <vista-cancion id="vistaCancion1"></vista-cancion>
  <vista-cancion id="vistaCancion2"></vista-cancion>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
