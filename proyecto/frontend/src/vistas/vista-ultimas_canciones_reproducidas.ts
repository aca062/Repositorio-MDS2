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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl); padding-top: 0;" id="layoutPrincipal">
 <h1 id="h1TituloUltimasCanciones">Últimas canciones reproducidas</h1>
 <vaadin-horizontal-layout theme="spacing" id="layoutCanciones" style="width: 100%;">
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
