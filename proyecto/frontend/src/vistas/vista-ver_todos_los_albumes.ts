import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_albumes';

@customElement('vista-ver_todos_los_albumes')
export class VistaVer_todos_los_albumes extends LitElement {
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
 <vaadin-horizontal-layout style="flex-shrink: 0;" id="layoutAlbumes">
  <vista-lista_albumes style="margin-left: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); margin-top: var(--lumo-space-xl);" id="vistaLista_albumes"></vista-lista_albumes>
  <vaadin-vertical-layout style="align-self: center; margin-right: var(--lumo-space-xl);" id="layoutNumeroPaginas">
   <h5 id="h5Paginas" style="flex-shrink: 1;">Mostrando 4 listas por pagina</h5>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="align-self: flex-end; align-items: center;" id="layoutBotonesPaginas">
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545680.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF" id="botonAtras"></vaadin-button>
  <h5 id="h5NumeroPaginas">Pagina X de X</h5>
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545682.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF" id="botonAdelante"></vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
