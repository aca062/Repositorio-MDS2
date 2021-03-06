import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_reproduccion_ajena';

@customElement('vista-listas_de_reproduccion_ajenas')
export class VistaListas_de_reproduccion_ajenas extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start;" id="layoutPrincipal">
 <h1 id="h1Titulo" style="align-self: flex-start;">Listas de reproducción donde aparece</h1>
 <vaadin-horizontal-layout theme="spacing" id="layoutListas" style="justify-content: flex-start; align-self: flex-start;">
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena"></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena1"></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena2"></vista-lista_de_reproduccion_ajena>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 8%; justify-content: flex-end; align-items: center;" id="layoutBoton">
  <vaadin-button id="verMas" style="margin-right: var(--lumo-space-xl);">
    Ver más 
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
