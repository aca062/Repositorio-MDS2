import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion';

@customElement('vista-lista_de_canciones')
export class VistaLista_de_canciones extends LitElement {
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
 <vista-cancion id="vistaCancion" style="width: 100%;"></vista-cancion>
 <vista-cancion id="vistaCancion1" style="width: 100%;"></vista-cancion>
 <vista-cancion id="vistaCancion2" style="width: 100%;"></vista-cancion>
 <vista-cancion id="vistaCancion3" style="width: 100%;"></vista-cancion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
