import { LitElement, html, css, customElement } from 'lit-element';
import './vista-lista_de_reproduccion_ajena';

@customElement('vista-listas_de_reproduccion_busqueda')
export class VistaListas_de_reproduccion_busqueda extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="layoutPrincipal">
 <h1 id="h1Titulo">Listas de reproducción</h1>
 <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena"></vista-lista_de_reproduccion_ajena>
 <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena1"></vista-lista_de_reproduccion_ajena>
 <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena2"></vista-lista_de_reproduccion_ajena>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
