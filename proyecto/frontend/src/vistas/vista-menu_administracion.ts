import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-menu_administracion')
export class VistaMenu_administracion extends LitElement {
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
 <h2 id="h2Administracion" style="align-self: center;">Administración</h2>
 <vaadin-vertical-layout id="layoutMenuAdmin" style="width: 90%; height: 90%; margin-top: 1%; margin-bottom: 5%; align-self: center;background-color: var(--lumo-contrast-10pct);">
  <vaadin-horizontal-layout id="layoutBotonesAdmin" style="align-self: center; flex-grow: 0; flex-shrink: 1; justify-content: center; align-items: flex-start; width: 100%;">
   <vaadin-button id="botonBuscarElemento" style="align-self: flex-start; flex-grow: 0; margin: var(--lumo-space-xl); width: 20%;">
     Buscar elemento 
   </vaadin-button>
   <vaadin-button id="botonDarDeAlta" style="margin: var(--lumo-space-xl); width: 20%;">
     Dar de alta 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="layoutLimiteCanciones" style="width: 100%; height: 20%; align-self: flex-start; align-items: center; justify-content: space-around;">
   <h4 id="h4TextoLimite" style="width: 50%; height: 25%;">Límite de canciones a reproducir por un usuario no registrado</h4>
   <vaadin-button id="botonEditarLimite">
    <iron-icon icon="lumo:edit" slot="prefix" id="iconoEditarLimite"></iron-icon>Editar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="layoutCancionesMostradas" style="width: 100%; height: 20%; align-items: center; justify-content: space-around;">
   <h4 style="width: 50%; height: 25%; flex-grow: 0;" id="h4TextoCancionesMostradas">Canciones mostradas a un usuario no registrado</h4>
   <vaadin-button id="botonEditarCanciones">
    <iron-icon icon="lumo:edit" slot="prefix" id="iconoEditarCanciones"></iron-icon>Editar 
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
