import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-paginacion_listas_ajenas';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-paginacion_listas_propias';

@customElement('vista-ver_listas_comun')
export class VistaVer_listas_comun extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; align-items: center;" id="layoutTitulo">
  <h1 id="h1Titulo" style="margin-left: var(--lumo-space-xl);">Listas de reproducción</h1>
  <h3 id="h3NumeroPagina" style="margin-right: var(--lumo-space-xl);">Mostrando 4 listas por página</h3>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="background-color: var(--lumo-contrast-10pct); width: 100%; padding: var(--lumo-space-l); align-self: center;" id="layoutlistas">
  <vista-paginacion_listas_ajenas id="vistaPaginacion_listas_ajenas" style="width: 100%; align-self: center; padding-bottom: 0;"></vista-paginacion_listas_ajenas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="width: 100%; align-self: center;">
  <vista-paginacion_listas_propias style="background-color: var(--lumo-contrast-10pct); width: 100%; padding: var(--lumo-space-xl);" id="vistaPaginacion_listas_propias"></vista-paginacion_listas_propias>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-items: center; align-self: flex-end; margin-right: var(--lumo-space-xl);" id="layoutBotones">
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545680.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF" id="botonAtras"></vaadin-button>
  <h3 id="h3NumeroPagina1">Página 1 de 4</h3>
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545682.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF" id="botonAdelante"></vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`</h1>
 </vaadin-horizontal-layout>
 <vista-paginacion_listas_ajenas></vista-paginacion_listas_ajenas>
 <vista-paginacion_listas_propias></vista-paginacion_listas_propias>
</vaadin-vertical-layout>
`p</h1>
 </vaadin-horizontal-layout>
 <vista-paginacion_listas_ajenas></vista-paginacion_listas_ajenas>
 <vista-paginacion_listas_propias></vista-paginacion_listas_propias>
</vaadin-vertical-layout>
`p</h1>
 </vaadin-horizontal-layout>
 <vista-paginacion_listas_ajenas></vista-paginacion_listas_ajenas>
 <vista-paginacion_listas_propias></vista-paginacion_listas_propias>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
