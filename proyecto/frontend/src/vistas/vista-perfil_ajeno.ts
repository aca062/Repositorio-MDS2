import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-listas_de_reproduccion_ajenas';

@customElement('vista-perfil_ajeno')
export class VistaPerfil_ajeno extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="layoutPerfil">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; padding: var(--lumo-space-xl);" id="layoutDatosPerfil">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;" id="layoutFoto">
    <img id="foto" style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;" id="layoutDatos">
    <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;" id="layoutNombreBoton">
     <h5 style="margin-top: 40px;" id="h5Nombre">Juice WRLD</h5>
     <vaadin-button style="margin-right: 10%; align-self: center;" id="botonDejarSeguir">
       Dejar de seguir 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="layoutCorreo">
     <h5 id="h5Correo">jWRLD@gmail.com</h5>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="layoutSeguidores">
    <h5 id="textoSeguidores">Seguidores</h5>
    <h5 id="numeroSeguidores">55168792</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="layoutSeguidos">
    <h5 id="h5Seguidos">Seguidos</h5>
    <h5 id="numeroSeguidos">25</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vista-listas_de_reproduccion_ajenas style="width: 100%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="listasPerfil"></vista-listas_de_reproduccion_ajenas>
</vaadin-vertical-layout>
`;
  }
  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
