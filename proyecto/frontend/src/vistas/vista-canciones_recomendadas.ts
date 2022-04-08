import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cancion';

@customElement('vista-canciones_recomendadas')
export class VistaCanciones_recomendadas extends LitElement {
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
 <h1 id="h1Titulo">Canciones</h1>
 <vista-cancion id="vistaCancion" style="height: 200px;"></vista-cancion>
 <vista-cancion id="vistaCancion1" style="height: 200px;"></vista-cancion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
