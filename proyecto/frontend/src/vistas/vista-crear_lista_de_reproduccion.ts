import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-crear_lista_de_reproduccion')
export class VistaCrear_lista_de_reproduccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="layoutPrincipal">
 <h2 id="h2Titulo" style="align-self: flex-start; padding-left: 50px">Crear lista de reproducción</h2>
 <vaadin-vertical-layout theme="spacing" id="layoutLista" style="width: 90%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);">
  <vaadin-text-field label="Nombre" id="nombre" style="width: 70%;" value="Mi lista nº 3" has-value></vaadin-text-field>
  <vaadin-select value="Buscador de canciones" id="listaCanciones" style="width: 70%;" label="Lista de canciones">
   <template>
    <vaadin-list-box selected="0" id="buscadorCanciones">
     <vaadin-item selected id="vaadinItem4">
       Buscador de canciones 
     </vaadin-item>
     <vaadin-item id="vaadinItem5">
       Item two 
     </vaadin-item>
     <vaadin-item id="vaadinItem6">
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-list-box id="listaCancion" style="width: 70%;">
   <vaadin-horizontal-layout style="justify-content: space-between; width: 60%;" id="layoutCancion">
    <vaadin-item id="nombreCancion">
      120 
    </vaadin-item>
    <vaadin-button id="eliminar">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="justify-content: space-between; width: 60%;" id="layoutCancion1">
    <vaadin-item id="nombre1">
      Lucid Dreams 
    </vaadin-item>
    <vaadin-button id="eliminar1">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-list-box>
  <vaadin-horizontal-layout theme="spacing-xl" id="layoutBotones" style="width: 100%; justify-content: flex-end;">
   <vaadin-button id="cancelar">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="confirmar">
     Confirmar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
