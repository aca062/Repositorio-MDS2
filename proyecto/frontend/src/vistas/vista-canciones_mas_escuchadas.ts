import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cancion';

@customElement('vista-canciones_mas_escuchadas')
export class VistaCanciones_mas_escuchadas extends LitElement {
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
 <h1 id="h1">Canciones más escuchadas</h1>
 <vista-cancion></vista-cancion>
 <vista-cancion></vista-cancion>
 <vista-cancion></vista-cancion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
