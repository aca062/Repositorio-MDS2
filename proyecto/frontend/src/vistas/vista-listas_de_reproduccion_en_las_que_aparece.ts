import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_reproduccion_ajena';

@customElement('vista-listas_de_reproduccion_en_las_que_aparece')
export class VistaListas_de_reproduccion_en_las_que_aparece extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin-left: var(--lumo-space-xl); padding-bottom: var(--lumo-space-l);" id="layoutPrincipal">
 <h1 id="h1Titulo">Listas de reproducción en las que aparece</h1>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="layoutListasPropias">
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena"></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena1"></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena2"></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena3"></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena id="vistaLista_de_reproduccion_ajena4"></vista-lista_de_reproduccion_ajena>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="layoutBoton">
  <vaadin-button id="verTodas">
    Ver todas 
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
