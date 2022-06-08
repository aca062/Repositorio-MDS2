import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listas_de_reproduccion_propias';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-perfil')
export class VistaPerfil extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutPerfil">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="layoutDatosPerfil">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;" id="layoutFotoPerfil">
    <img id="fotoPerfil" style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);">
    <vaadin-button id="botonEditarFotoPerfil">
      Editar 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;" id="layoutDatos">
    <h5 style="margin-top: 40px;" id="h5Nombre">Paco12</h5>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="layoutCorreo">
     <h5 id="h5Correo" style="align-self: center;">Pakito12@gmail.com</h5>
     <vaadin-button id="botonEditarCorreo" style="align-self: center;">
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="layoutSeguidores">
    <h5 id="textoSeguidores">Seguidores</h5>
    <h5 id="numeroSeguidores">9</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="layoutSeguidos">
    <h5 id="textoSeguidos">Seguidos</h5>
    <h5 id="numeroSeguidos">120</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);" id="botonRecibirNotificaciones">
    Recibir notificaciones 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); align-self: flex-end;" id="botonCrearLista">
    Crear una nueva lista 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; justify-content: flex-start; background-color: var(--lumo-contrast-10pct);" id="layoutTusListas">
  <vista-listas_de_reproduccion_propias style="background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-l);" id="tusListas"></vista-listas_de_reproduccion_propias>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="layoutDarseBaja">
  <vaadin-button style="margin: var(--lumo-space-m);" id="botonDarseBaja">
    Darse de baja 
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
