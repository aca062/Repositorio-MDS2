import { LitElement, html, css, customElement } from 'lit-element';
import './vista-lista_de_reproduccion_admin';

@customElement('vista-listas_de_reproduccion_busqueda_admin')
export class VistaListas_de_reproduccion_busqueda_admin extends LitElement {
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
 <h1 id="h1Titulo">Listas de reproducción</h1>
 <vaadin-horizontal-layout theme="spacing" id="layoutListas" style="width: 100%;">
  <vista-lista_de_reproduccion_admin id="vistaLista_de_reproduccion_admin" style="width: 50%;"></vista-lista_de_reproduccion_admin>
  <vista-lista_de_reproduccion_admin id="vistaLista_de_reproduccion_admin1" style="width: 50%;"></vista-lista_de_reproduccion_admin>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
