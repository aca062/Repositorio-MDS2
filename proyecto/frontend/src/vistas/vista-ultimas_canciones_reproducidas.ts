import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cancion';

@customElement('vista-ultimas_canciones_reproducidas')
export class VistaUltimas_canciones_reproducidas extends LitElement {
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
 <h1 id="h1">Últimas canciones reproducidas</h1>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
  <vista-cancion></vista-cancion>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
